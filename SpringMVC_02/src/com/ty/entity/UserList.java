package com.ty.entity;

import java.util.ArrayList;
import java.util.List;

public final class UserList {
	List<User> lists = new ArrayList<User>();

	public List<User> getLists() {
		return lists;
	}

	public void setLists(List<User> lists) {
		this.lists = lists;
	}
	
}
