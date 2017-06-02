import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Scanner;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;

import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Panel;
import java.awt.Canvas;
import java.awt.List;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Box;
import java.awt.TextArea;

import java.awt.Label;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Protien_x {

	protected static final File File = null;
	private JFrame homeframe;
	private JFrame DNAframe;
	private JTextField InFile;
	private JTextField OutFile;
	private JButton extra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Protien_x window = new Protien_x();
					window.homeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Protien_x() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//Initialize Main Window
		homeframe = new JFrame("Protien X");
		homeframe.setResizable(false);
		homeframe.setBackground(new Color(102, 102, 153));
		homeframe.getContentPane().setForeground(SystemColor.desktop);
		homeframe.setBounds(100, 100, 710, 416);
		homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeframe.getContentPane().setLayout(null);
//Labels Below		
		JLabel lblWelcomeToProtein = new JLabel("Protein X");
		lblWelcomeToProtein.setFont(new Font("Vani", Font.BOLD, 29));
		lblWelcomeToProtein.setBounds(39, 55, 152, 49);
		homeframe.getContentPane().add(lblWelcomeToProtein);
		
		JLabel lblOurMissionIs = new JLabel("Simple Analysis");
		lblOurMissionIs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOurMissionIs.setBounds(49, 92, 112, 24);
		homeframe.getContentPane().add(lblOurMissionIs);
		
		Label DNA_analysis = new Label("DNA Analysis");
		DNA_analysis.setAlignment(Label.CENTER);
		DNA_analysis.setBackground(SystemColor.window);
		DNA_analysis.setFont(new Font("Dialog", Font.BOLD, 9));
		DNA_analysis.setBounds(262, 290, 107, 35);
		homeframe.getContentPane().add(DNA_analysis);
		
		Label ProtienBuild = new Label("Protein Builder");
		ProtienBuild.setAlignment(Label.CENTER);
		ProtienBuild.setBackground(SystemColor.window);
		ProtienBuild.setFont(new Font("Dialog", Font.BOLD, 10));
		ProtienBuild.setBounds(375, 292, 86, 30);
		homeframe.getContentPane().add(ProtienBuild);
		
		Label Compare = new Label("Compare Seq");
		Compare.setBackground(SystemColor.window);
		Compare.setFont(new Font("Dialog", Font.BOLD, 10));
		Compare.setForeground(new Color(0, 0, 51));
		Compare.setBounds(467, 292, 80, 31);
		homeframe.getContentPane().add(Compare);
		
		Label Extras = new Label("Extras");
		Extras.setAlignment(Label.CENTER);
		Extras.setBackground(SystemColor.window);
		Extras.setFont(new Font("Dialog", Font.BOLD, 10));
		Extras.setBounds(557, 292, 81, 31);
		homeframe.getContentPane().add(Extras);
//Buttons Below 		
		JButton Dnabutt = new JButton("");
		Dnabutt.setBackground(UIManager.getColor("Button.shadow"));
		Dnabutt.setIcon(new ImageIcon(Protien_x.class.getResource("/Images/DNA.png")));
		Dnabutt.setBounds(282, 222, 64, 59);
		homeframe.getContentPane().add(Dnabutt);
// DNA ALGORITHMS
		Dnabutt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homeframe.setVisible(false);
				JFrame DNAframe = new JFrame("DNA Analysis");
				DNAframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
				DNAframe.setResizable(false);
				DNAframe.setBackground(new Color(102, 102, 153));
				DNAframe.getContentPane().setForeground(SystemColor.desktop);
				DNAframe.setBounds(100, 100, 627, 415);
				DNAframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				DNAframe.getContentPane().setLayout(null);
				DNAframe.setVisible(true);
				
				JLabel DNA_welcome = new JLabel("DNA Analysis");
				DNA_welcome.setBounds(28, 21, 217, 49);
				DNA_welcome.setForeground(new Color(102, 204, 255));
				DNA_welcome.setBackground(UIManager.getColor("Button.disabledShadow"));
				DNA_welcome.setFont(new Font("Vani", Font.BOLD, 29));
				DNAframe.getContentPane().add(DNA_welcome);
				
				JLabel lblPleaseEnterThe = new JLabel("Please Enter The");
				lblPleaseEnterThe.setBounds(76, 202, 130, 20);
				lblPleaseEnterThe.setForeground(new Color(51, 204, 255));
				lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD, 14));
				DNAframe.getContentPane().add(lblPleaseEnterThe);
				
				JLabel lblNumberOfSequences = new JLabel("Number of Expected Sequences");
				lblNumberOfSequences.setBounds(25, 220, 231, 20);
				lblNumberOfSequences.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNumberOfSequences.setForeground(new Color(51, 204, 255));
				DNAframe.getContentPane().add(lblNumberOfSequences);
				
				JSpinner spinner = new JSpinner();
				spinner.setBounds(105, 253, 55, 29);
				spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
				DNAframe.getContentPane().add(spinner);
				

//INFILE DNA				
				InFile = new JTextField();
				InFile.setBounds(10, 94, 130, 20);
				DNAframe.getContentPane().add(InFile);
				InFile.setColumns(10);
				InFile.setText("Enter In File");
				
				JButton btnBrowse = new JButton("BROWSE");
				btnBrowse.setBounds(150, 93, 89, 23);
				DNAframe.getContentPane().add(btnBrowse);
				btnBrowse.addActionListener(new ActionListener()
				{
					
//Browse Button	IN FILE				
					public void actionPerformed(ActionEvent e)
					{
						JFileChooser chooser = new JFileChooser();
					    FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "JPG & GIF Images", "jpg", "gif", "txt", "fa");
					    chooser.setFileFilter(filter);
						int returnVal = chooser.showOpenDialog(btnBrowse);
					    if(returnVal == JFileChooser.APPROVE_OPTION) {
					    	//This is where the action occurs for Browse
					    	File f = chooser.getSelectedFile();
					    	String infilename = f.getAbsolutePath();
					    	InFile.setText(infilename);
					    	// Read The FASTA
					    	try {

								ArrayList protname = new ArrayList<String>();
								ArrayList multseq = new ArrayList<String>();
								ArrayList seq = new ArrayList<String>();
						        boolean first = true;
						        
						        try (Scanner sc = new Scanner(new File(infilename)))
						        {
						            while (sc.hasNextLine()) 
						            {
						                String line = sc.nextLine().trim();
						                //Get Protein ID's
						                if (line.charAt(0) == '>') 
						                {		
						                		//Add ID to protname LIST
							                    protname.add(line.substring(1));	
						                		//If Seq LIST not empty merge it and add the sequence to the multseq LIST
							                    if (!seq.isEmpty())
						                		{String joined = String.join("", seq);
						                			multseq.add(joined);
						                			seq.clear();}
							             } 
						                //Add line to Seq LIST
							            else{seq.add(line);}
						            }
						        //To Clean up and catch the last sequence 
						        if (!seq.isEmpty())
		                		{String joined = String.join("", seq);
		                			multseq.add(joined);
		                			seq.clear(); }
						      //Just some Checks
						        JOptionPane.showMessageDialog(null, protname);
						        JOptionPane.showMessageDialog(null, multseq);
						      }
						        

							
					    catch (IOException ex)
						        {
								// TODO Auto-generated catch block
								System.out.println("ERROR READING FILE");
							}
					    	}
					    	//NOT SURE WHAT TO DO HERE
					    	finally
					    	{
					    		System.out.print("");
					    	}
					    	
					    }
					}
				});

//Out FIle DNA				
				OutFile = new JTextField();
				OutFile.setBounds(10, 168, 130, 20);
				OutFile.setColumns(10);
				DNAframe.getContentPane().add(OutFile);
				OutFile.setText("Enter Out File");
				JButton OutBrowse = new JButton("BROWSE");
				OutBrowse.setBounds(150, 168, 89, 23);
				DNAframe.getContentPane().add(OutBrowse);
				OutBrowse.addActionListener(new ActionListener()
				{
					
//Browse Button	OUTFILE				
					public void actionPerformed(ActionEvent e)
					{
						JFileChooser chooser = new JFileChooser();
					    FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "JPG & GIF Images", "jpg", "gif", "txt");
					    chooser.setFileFilter(filter);
						int returnVal = chooser.showOpenDialog(btnBrowse);
					    if(returnVal == JFileChooser.APPROVE_OPTION) {
					    	//This is where the action occurs for Browse
					    	File f = chooser.getSelectedFile();
					    	String outfilename = f.getAbsolutePath();
					    	OutFile.setText(outfilename);
					    	
					    }
					}
				});
				
				JButton btnRunAnalysis = new JButton("RUN ANALYSIS");
				btnRunAnalysis.setBounds(76, 311, 121, 23);
				DNAframe.getContentPane().add(btnRunAnalysis);
				btnRunAnalysis.addActionListener(new ActionListener()
				{
					
//RUN ANALYSIS				
					public void actionPerformed(ActionEvent e)
					{
						
						
					//Read the Infile 
						//How many sequences and sequence names (does it match expected)
						//If not then have it say "Does Not MAtch expected" or some shit
						//Then have list of Radio Button input and Actions (IF) actions
						JOptionPane.showMessageDialog(null, "This is a working Butt");	
					}
				});
					
					
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(409, 63, 186, 292);
				DNAframe.getContentPane().add(scrollPane);
				
				Panel panel = new Panel();
				scrollPane.setViewportView(panel);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[]{109, 0};
				gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panel.setLayout(gbl_panel);
				
				JRadioButton GC = new JRadioButton("GC Content");
				GridBagConstraints gbc_GC = new GridBagConstraints();
				gbc_GC.insets = new Insets(0, 0, 5, 0);
				gbc_GC.anchor = GridBagConstraints.NORTHWEST;
				gbc_GC.gridx = 0;
				gbc_GC.gridy = 0;
				panel.add(GC, gbc_GC);
				
				JRadioButton rdbtnConcensusString = new JRadioButton("Concensus String");
				GridBagConstraints gbc_rdbtnConcensusString = new GridBagConstraints();
				gbc_rdbtnConcensusString.insets = new Insets(0, 0, 5, 0);
				gbc_rdbtnConcensusString.gridx = 0;
				gbc_rdbtnConcensusString.gridy = 1;
				panel.add(rdbtnConcensusString, gbc_rdbtnConcensusString);
				
				JRadioButton rdbtnDnaToMrna = new JRadioButton("DNA to mRNA");
				rdbtnDnaToMrna.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_rdbtnDnaToMrna = new GridBagConstraints();
				gbc_rdbtnDnaToMrna.insets = new Insets(0, 0, 5, 0);
				gbc_rdbtnDnaToMrna.gridx = 0;
				gbc_rdbtnDnaToMrna.gridy = 2;
				panel.add(rdbtnDnaToMrna, gbc_rdbtnDnaToMrna);
				
				JRadioButton Exon = new JRadioButton("Exon Analysis");
				GridBagConstraints gbc_Exon = new GridBagConstraints();
				gbc_Exon.insets = new Insets(0, 0, 5, 0);
				gbc_Exon.gridx = 0;
				gbc_Exon.gridy = 3;
				panel.add(Exon, gbc_Exon);
				
				JRadioButton rdbtnBasianStatistics = new JRadioButton("Basian Statistics*");
				GridBagConstraints gbc_rdbtnBasianStatistics = new GridBagConstraints();
				gbc_rdbtnBasianStatistics.insets = new Insets(0, 0, 5, 0);
				gbc_rdbtnBasianStatistics.gridx = 0;
				gbc_rdbtnBasianStatistics.gridy = 4;
				panel.add(rdbtnBasianStatistics, gbc_rdbtnBasianStatistics);
				
				JRadioButton rdbtnHardyWeinberg = new JRadioButton("Hardy Weinberg Statistics");
				GridBagConstraints gbc_rdbtnHardyWeinberg = new GridBagConstraints();
				gbc_rdbtnHardyWeinberg.insets = new Insets(0, 0, 5, 0);
				gbc_rdbtnHardyWeinberg.gridx = 0;
				gbc_rdbtnHardyWeinberg.gridy = 5;
				panel.add(rdbtnHardyWeinberg, gbc_rdbtnHardyWeinberg);
				

				
				JLabel lblOptions = new JLabel("OPTIONS");
				lblOptions.setBounds(464, 29, 96, 25);
				lblOptions.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblOptions.setForeground(new Color(255, 255, 0));
				DNAframe.getContentPane().add(lblOptions);
				
				JLabel lblEnterFastaFile = new JLabel("Enter fasta File:");
				lblEnterFastaFile.setBounds(75, 63, 109, 20);
				lblEnterFastaFile.setForeground(new Color(51, 204, 255));
				lblEnterFastaFile.setFont(new Font("Tahoma", Font.BOLD, 14));
				DNAframe.getContentPane().add(lblEnterFastaFile);
				
				JLabel lblEnterOutFile = new JLabel("Enter Out File:");
				lblEnterOutFile.setBounds(82, 137, 109, 20);
				lblEnterOutFile.setForeground(new Color(51, 204, 255));
				lblEnterOutFile.setFont(new Font("Tahoma", Font.BOLD, 14));
				DNAframe.getContentPane().add(lblEnterOutFile);
				
				JLabel Backdrop = new JLabel("");
				Backdrop.setBounds(0, 0, 621, 366);
				Backdrop.setIcon(new ImageIcon(Protien_DNA.class.getResource("/Images/DNA_wel.jpg")));
				DNAframe.getContentPane().add(Backdrop);
				
				

				
				JMenuBar menuBar = new JMenuBar();
				DNAframe.setJMenuBar(menuBar);
				
				JMenu mnMenu = new JMenu("Menu");
				menuBar.add(mnMenu);
				
				JMenuItem Home = new JMenuItem("Home");
				Home.addActionListener(new ActionListener()
				{
					
//RUN ANALYSIS				
					public void actionPerformed(ActionEvent e)
					{
						DNAframe.setVisible(false);
						homeframe.setVisible(true);
					}
				});
				mnMenu.add(Home);
				
				JMenuItem mntmMyLibrary = new JMenuItem("My Library");
				mnMenu.add(mntmMyLibrary);
				
				JMenuItem mntmToolKit = new JMenuItem("Tool Kit");
				mnMenu.add(mntmToolKit);
			}


//				JOptionPane.showMessageDialog(null, "This is a working Butt");
//				File file = new File("C:/Users/bag019/workspace/Protien_/Protien_DNA.java");
//				try {
//					Desktop.getDesktop().open(file);
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
					
		);
		
		JButton Prot = new JButton("");
		Prot.setIcon(new ImageIcon(Protien_x.class.getResource("/Images/build.png")));
		Prot.setBounds(380, 222, 64, 59);
		homeframe.getContentPane().add(Prot);
		
		JButton comp = new JButton("");
		comp.setIcon(new ImageIcon(Protien_x.class.getResource("/Images/compare.png")));
		comp.setBounds(470, 222, 64, 59);
		homeframe.getContentPane().add(comp);
		
		extra = new JButton("");
		extra.setIcon(new ImageIcon(Protien_x.class.getResource("/Images/other.png")));
		extra.setBounds(562, 222, 64, 59);
		homeframe.getContentPane().add(extra);
		
		JLabel Backdrop = new JLabel("");
		Backdrop.setIcon(new ImageIcon(Protien_x.class.getResource("/Images/Protein.jpg")));
		Backdrop.setBounds(0, 0, 694, 357);
		homeframe.getContentPane().add(Backdrop);
		
		

		
		JMenuBar menuBar = new JMenuBar();
		homeframe.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Home");
		mnMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmMyLibrary = new JMenuItem("My Library");
		mnMenu.add(mntmMyLibrary);
		
		JMenuItem mntmToolKit = new JMenuItem("Tool Kit");
		mnMenu.add(mntmToolKit);
	}
}
