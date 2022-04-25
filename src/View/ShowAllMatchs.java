package View;

import Business.TournamentManagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShowAllMatchs extends JPanel {
	private TournamentManagement manager;
	private JTable table;
	private JLabel title;

	public ShowAllMatchs() {
		manager = new TournamentManagement();
		setLayout(new BorderLayout());

		// title
		title = new JLabel("Tableau des matchs", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.PLAIN, 40));
		add(title, BorderLayout.NORTH);

		// table
		String[] tableHead = {"Id", "Date", "Durée", "Finale", "Commentaire", "Tournoi", "Arbitre", "Emplacement"};
		DefaultTableModel tableModel = new DefaultTableModel(tableHead, 0);
		table = new JTable(tableModel);

		for (String[] match : manager.getAllMatchs()) {
			tableModel.addRow(match);
		}
		table.setRowHeight(30);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
}