package GroupsPackage;

import java.io.File;
import java.util.Vector;

public class GroupManager {
	@SuppressWarnings("unused")
	private int nGroups;
	private Vector<Group> Groups;

	/**
	 * 
	 * @param name
	 * @param type
	 * @param picture
	 */
	public void addGroup(String name, int type, File picture) {
		// TODO - implement GroupManager.addGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param GroupID
	 */
	public void removeGroup(int GroupID) {
		// TODO - implement GroupManager.removeGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param GroupID
	 */
	public Group getGroup(int GroupID) {
		// TODO - implement GroupManager.getGroup
		throw new UnsupportedOperationException();
	}

	public Vector<Group> getGroups() {
		return Groups;
	}

	public void setGroups(Vector<Group> groups) {
		Groups = groups;
	}
}
