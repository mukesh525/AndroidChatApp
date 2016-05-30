package com.example.mukesh.androidchatapp.interfaces;


import com.example.mukesh.androidchatapp.types.FriendInfo;
import com.example.mukesh.androidchatapp.types.MessageInfo;

public interface IUpdateData {
	public void updateData(MessageInfo[] messages, FriendInfo[] friends, FriendInfo[] unApprovedFriends, String userKey);

}
