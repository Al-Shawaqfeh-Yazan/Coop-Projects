import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

public class SwimTeamManager {

	private JFrame frmGlenforestSwimTeam;
	private JTable table;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	JPanel SearchTab = new JPanel();
	JPanel Main = new JPanel();
	JPanel FilterTab = new JPanel();
	JPanel AddTab = new JPanel();
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action action_7 = new SwingAction_7();
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder window = new WindowBuilder();
					window.frmGlenforestSwimTeam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGlenforestSwimTeam = new JFrame();
		frmGlenforestSwimTeam.setTitle("Glenforest Swim Team Manager");
		frmGlenforestSwimTeam.setBounds(100, 100, 666, 542);
		frmGlenforestSwimTeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGlenforestSwimTeam.getContentPane().setLayout(null);
		
		SearchTab.setBackground(Color.DARK_GRAY);
		SearchTab.setBounds(0, 0, 661, 515);
		SearchTab.setVisible(false);
		
				FilterTab.setBackground(Color.DARK_GRAY);
				FilterTab.setBounds(0, 0, 661, 515);
				FilterTab.setVisible(false);
				

				AddTab.setBackground(Color.DARK_GRAY);
				AddTab.setBounds(0, 0, 661, 515);
				AddTab.setVisible(false);
				frmGlenforestSwimTeam.getContentPane().add(AddTab);
				AddTab.setLayout(null);
				
				textField = new JTextField();
				textField.setForeground(Color.BLACK);
				textField.setBounds(197, 161, 128, 20);
				AddTab.add(textField);
				textField.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setForeground(Color.BLACK);
				textField_2.setColumns(10);
				textField_2.setBounds(184, 230, 141, 20);
				AddTab.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setForeground(Color.BLACK);
				textField_3.setColumns(10);
				textField_3.setBounds(184, 291, 141, 20);
				AddTab.add(textField_3);
				
				textField_4 = new JTextField();
				textField_4.setForeground(Color.BLACK);
				textField_4.setColumns(10);
				textField_4.setBounds(184, 347, 141, 20);
				AddTab.add(textField_4);
				
				JLabel lblFirstName = new JLabel("First Name:");
				lblFirstName.setForeground(Color.WHITE);
				lblFirstName.setFont(new Font("Sylfaen", Font.ITALIC, 20));
				lblFirstName.setBounds(75, 229, 101, 20);
				AddTab.add(lblFirstName);
				
				JLabel lblLastName = new JLabel("Last Name:");
				lblLastName.setForeground(Color.WHITE);
				lblLastName.setFont(new Font("Sylfaen", Font.ITALIC, 20));
				lblLastName.setBounds(75, 290, 112, 20);
				AddTab.add(lblLastName);
				
				JLabel lblDobddmmyyyy = new JLabel("D.O.B(dd/mm/yyyy)");
				lblDobddmmyyyy.setForeground(Color.WHITE);
				lblDobddmmyyyy.setFont(new Font("Sylfaen", Font.ITALIC, 20));
				lblDobddmmyyyy.setBounds(10, 160, 187, 20);
				AddTab.add(lblDobddmmyyyy);
				
				JLabel lblStudent = new JLabel("Student #:");
				lblStudent.setForeground(Color.WHITE);
				lblStudent.setFont(new Font("Sylfaen", Font.ITALIC, 20));
				lblStudent.setBounds(75, 346, 99, 20);
				AddTab.add(lblStudent);
				
				JLabel lblGender = new JLabel("Gender:");
				lblGender.setForeground(Color.WHITE);
				lblGender.setFont(new Font("Sylfaen", Font.ITALIC, 23));
				lblGender.setBounds(75, 396, 89, 27);
				AddTab.add(lblGender);
				
				JRadioButton rdbtnMale = new JRadioButton("Male");
				buttonGroup_1.add(rdbtnMale);
				rdbtnMale.setBackground(Color.WHITE);
				rdbtnMale.setBounds(269, 400, 57, 23);
				AddTab.add(rdbtnMale);
				
				JRadioButton rdbtnFemale = new JRadioButton("Female");
				buttonGroup_1.add(rdbtnFemale);
				rdbtnFemale.setBackground(Color.WHITE);
				rdbtnFemale.setBounds(184, 400, 71, 23);
				AddTab.add(rdbtnFemale);
				
				JButton btnAdd = new JButton("Add Student");
				btnAdd.setHorizontalAlignment(SwingConstants.TRAILING);
				btnAdd.setBackground(Color.WHITE);
				btnAdd.setFont(new Font("Vani", Font.PLAIN, 19));
				btnAdd.setBounds(65, 447, 141, 27);
				AddTab.add(btnAdd);
				
				JLabel lblAddingAStudent = new JLabel("<html>Please fill all required information to");
				lblAddingAStudent.setForeground(Color.WHITE);
				lblAddingAStudent.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
				lblAddingAStudent.setBounds(128, 64, 378, 45);
				AddTab.add(lblAddingAStudent);
				
				JLabel lblAddAStudent = new JLabel("add a student");
				lblAddAStudent.setForeground(Color.WHITE);
				lblAddAStudent.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
				lblAddAStudent.setBounds(237, 97, 141, 38);
				AddTab.add(lblAddAStudent);
				
				JButton btnNewButton_2_2_1 = new JButton("");
				btnNewButton_2_2_1.setAction(action_7);
				btnNewButton_2_2_1.setForeground(Color.WHITE);
				btnNewButton_2_2_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (5).png"));
				btnNewButton_2_2_1.setBackground(Color.WHITE);
				btnNewButton_2_2_1.setBounds(0, 0, 107, 46);
				AddTab.add(btnNewButton_2_2_1);
				
				
				Main.setBounds(0, 0, 661, 515);
				frmGlenforestSwimTeam.getContentPane().add(Main);
				Main.setLayout(null);
				
				table = new JTable();
				table.setForeground(new Color(255, 255, 255));
				table.setBackground(new Color(0, 0, 0));
				table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table.setBorder(null);
				table.setFillsViewportHeight(true);
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Student's Name:", "Age:", "Gender:", "Birthdate:", "Student #:", "Event:"},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"Student's Namesss:", "New column", "New column", "New column", "New column", "New column"
					}
				) {
					Class[] columnTypes = new Class[] {
						String.class, String.class, Object.class, Object.class, Object.class, Object.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
						false, false, false, false, false, false
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				table.getColumnModel().getColumn(0).setResizable(false);
				table.getColumnModel().getColumn(0).setPreferredWidth(98);
				table.getColumnModel().getColumn(1).setResizable(false);
				table.getColumnModel().getColumn(1).setPreferredWidth(42);
				table.getColumnModel().getColumn(2).setResizable(false);
				table.getColumnModel().getColumn(2).setPreferredWidth(56);
				table.getColumnModel().getColumn(3).setResizable(false);
				table.getColumnModel().getColumn(3).setPreferredWidth(61);
				table.getColumnModel().getColumn(4).setResizable(false);
				table.getColumnModel().getColumn(5).setResizable(false);
				table.setCellSelectionEnabled(true);
				table.setColumnSelectionAllowed(true);
				table.setBounds(0, 65, 661, 450);
				Main.add(table);
				
				JButton btnNewButton = new JButton("");
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setAction(action);
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (2).png"));
				btnNewButton.setBounds(0, 0, 94, 57);
				Main.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.setBackground(Color.WHITE);
				btnNewButton_1.setAction(action_1);
				btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (3).png"));
				btnNewButton_1.setBounds(94, 0, 94, 57);
				Main.add(btnNewButton_1);
				
				JButton btnEvents = new JButton("Events");
				btnEvents.setFont(new Font("Vani", Font.BOLD, 13));
				btnEvents.setBackground(Color.WHITE);
				btnEvents.setAction(action_2);
				btnEvents.setBounds(188, 0, 94, 57);
				Main.add(btnEvents);
				
				JButton btnAddEvent = new JButton("<html>Add Event</html>");
				btnAddEvent.setBackground(Color.WHITE);
				btnAddEvent.setAction(action_3);
				btnAddEvent.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnAddEvent.setBounds(282, 0, 94, 57);
				Main.add(btnAddEvent);
				
				JButton btnAddStudent = new JButton("<html>Add                   Student</html>");
				btnAddStudent.setBackground(Color.WHITE);
				btnAddStudent.setAction(action_4);
				btnAddStudent.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnAddStudent.setBounds(376, 0, 94, 57);
				Main.add(btnAddStudent);
				
				JButton btnRemoveStudent = new JButton("<html>Remove Student</html>");
				btnRemoveStudent.setBackground(Color.WHITE);
				btnRemoveStudent.setAction(action_5);
				btnRemoveStudent.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnRemoveStudent.setBounds(470, 0, 94, 57);
				Main.add(btnRemoveStudent);
				
				JButton btnNewButton_5_1 = new JButton("<html>Edit Student</html>");
				btnNewButton_5_1.setBackground(Color.WHITE);
				btnNewButton_5_1.setAction(action_6);
				btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnNewButton_5_1.setBounds(564, 0, 94, 57);
				Main.add(btnNewButton_5_1);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.BLACK);
				panel_1.setBounds(0, 57, 661, 7);
				Main.add(panel_1);
				frmGlenforestSwimTeam.getContentPane().add(FilterTab);
				FilterTab.setLayout(null);
				
				JLabel lblFilterBy = new JLabel("Filter By:");
				lblFilterBy.setForeground(Color.WHITE);
				lblFilterBy.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 46));
				lblFilterBy.setBounds(236, 111, 229, 53);
				FilterTab.add(lblFilterBy);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Age", "Gender", "Event"}));
				comboBox.setBounds(159, 206, 347, 22);
				FilterTab.add(comboBox);
				
				JButton btnNewButton_2_2 = new JButton("");
				btnNewButton_2_2.setAction(action_7);
				btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (5).png"));
				btnNewButton_2_2.setBackground(Color.WHITE);
				btnNewButton_2_2.setBounds(0, 0, 107, 46);
				FilterTab.add(btnNewButton_2_2);
		frmGlenforestSwimTeam.getContentPane().add(SearchTab);
		SearchTab.setLayout(null);

		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setAction(action_7);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (5).png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(0, 0, 107, 46);
		SearchTab.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 162, 450, 32);
		SearchTab.add(textField_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (2).png"));
		btnNewButton_2_1.setBounds(542, 162, 42, 32);
		SearchTab.add(btnNewButton_2_1);
		
		JRadioButton rdbtnSearchByStudent = new JRadioButton("Search by Student #");
		rdbtnSearchByStudent.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnSearchByStudent);
		rdbtnSearchByStudent.setSelected(true);
		rdbtnSearchByStudent.setBounds(82, 249, 212, 23);
		SearchTab.add(rdbtnSearchByStudent);
		
		JRadioButton rdbtnSearchByName = new JRadioButton("Search by Name");
		rdbtnSearchByName.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnSearchByName);
		rdbtnSearchByName.setBounds(323, 249, 212, 23);
		SearchTab.add(rdbtnSearchByName);
		
		JPanel EventsTab = new JPanel();
		EventsTab.setBounds(0, 0, 10, 10);
		frmGlenforestSwimTeam.getContentPane().add(EventsTab);
	}
	private class SwingAction extends AbstractAction {

		public void actionPerformed(ActionEvent e) {
			frmGlenforestSwimTeam.getContentPane().remove(Main);
			SearchTab.setVisible(true);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			frmGlenforestSwimTeam.getContentPane().remove(Main);
			FilterTab.setVisible(true);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Events");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "<html>Add Event</html>");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "<html>Add                   Student</html>");
		}
		public void actionPerformed(ActionEvent e) {
			frmGlenforestSwimTeam.getContentPane().remove(Main);
			AddTab.setVisible(true);
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "<html>Remove Student</html>");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "<html>Edit Student</html>");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			SearchTab.setVisible(false);
			FilterTab.setVisible(false);
			AddTab.setVisible(false);
			frmGlenforestSwimTeam.getContentPane().add(Main);
		}
	}
}
