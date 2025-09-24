package com.klef.fsd.sdp.service;

import java.util.List;
import java.util.Optional; // <-- Added import

import com.klef.fsd.sdp.model.BookEvent;
import com.klef.fsd.sdp.model.Event;
import com.klef.fsd.sdp.model.Manager;

public interface ManagerService 
{
   public Manager checkmanagerlogin(String username, String password);
  
   public String addevent(Event event);
   public List<Event> vieweventsbymanager(int mid);
  
   public Optional<Manager> getManagerById(int mid); // <-- Return Optional
  
   public List<BookEvent> getbookingsbyManager(int mid);
  
   public String updatebookingstatus(int id, String status);
}
