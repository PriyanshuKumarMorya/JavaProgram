package StudentGradeTrackerGUI;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StudentGradeTracker extends JFrame {

    static class Student{
        private String name;
        private int marks;

        public Student(String name,int marks){
            this.name=name;
            this.marks=marks;
        }

        public String getName(){
            return name;
        }

        public int getMarks(){
            return marks;
        }
    }

    private JTextField nameField;
    private JTextField marksField;
    private JTextArea  reportArea;

    private ArrayList<Student> students = new ArrayList<>();

    public StudentGradeTracker() {
        setTitle("Student GradeTracker");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        inputPanel.add(new JLabel("Student name: "));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Marks: "));
        marksField = new JTextField();
        inputPanel.add(marksField);

        JButton addButton = new JButton("Add Student");
        JButton reportButton = new JButton("Show Report ");

        inputPanel.add(addButton);
        inputPanel.add(reportButton);

        reportArea = new JTextArea();
        reportArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(reportArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(e -> addStudent());
        reportButton.addActionListener(e -> showReport());


    }

    private void addStudent(){
        try{
            String name = nameField.getText().trim();
            int marks = Integer.parseInt(marksField.getText().trim());

            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter student name.");
                return;
            }
            students.add(new Student(name,marks));
            JOptionPane.showMessageDialog(this, "Student Added Successfully.");

            nameField.setText("");
            marksField.setText("");
            nameField.requestFocus();

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Marks must be a Integer number.");

        }
    }

    private void showReport(){
        if(students.isEmpty()){
            reportArea.setText("No students have been added.");
            return;
        }
        int total =0;
        Student higest = students.get(0);
        Student lowest =students.get(0);

        StringBuilder report = new StringBuilder();

        report.append("Student Summary Report\n");
        report.append("------------------------------------------------\n");
        report.append(String.format("%-20s %s\n","Name","Marks"));
        report.append("-------------------------------------------------\n");

        for(Student s : students){
            report.append(String.format("%-20s %s\n",s.getName(),s.getMarks()));

            total += s.getMarks();
            if(s.getMarks()>higest.getMarks()){
                higest = s;
            }
            if(s.getMarks()<lowest.getMarks()){
                lowest = s;
            }
        }

        double average = (double) total / students.size();
        report.append("\n--------------------------------------------\n");
        report.append(String.format("%-20s %s\n","Average",average));
        report.append("Higest Marks: "+higest.getMarks()+"("+higest.getName()+")\n");
        report.append("Lowest Marks: "+lowest.getMarks()+"("+lowest.getName()+")\n");

        reportArea.setText(report.toString());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           new StudentGradeTracker().setVisible(true);
        });

    }
}
