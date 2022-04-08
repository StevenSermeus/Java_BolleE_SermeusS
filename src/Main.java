import DataAccess.*;
import Model.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			DataAccess dataAccess = new DBAccess();
			ArrayList<MatchResearch> list = dataAccess.getAllMatchs();
			for (MatchResearch match : list) {
				System.out.println(match);
			}
		} catch (DataException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
