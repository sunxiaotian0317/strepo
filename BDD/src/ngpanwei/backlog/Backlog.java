package ngpanwei.backlog;

import java.util.ArrayList;
import java.util.HashMap;

public class Backlog {
	private HashMap<String,Task> taskMap;
	public Backlog(){
		taskMap = new HashMap<String,Task>();
	}
	public Task add(String taskName){
		Task newTask = new Task(taskName);
		taskMap.put(taskName,newTask);
		return newTask;
	}
	public Task getTask(String taskName){
		Task newTask = taskMap.get(taskName);
		return getTask(null);
	}
	public Task setTaskStatus(String taskName,String status){
		Task task = getTask(taskName);
		task.setStatus(status);
		return task;
	}
	public ArrayList<Task> getUnompleteTask(){
		ArrayList<Task> uncompletedTasks = new ArrayList<Task>();
		for(java.util.Map.Entry<String, Task> entry : taskMap.entrySet()){
		Task task = entry.getValue();
			if(!task.getStatus().equals(Task.STATUS_DONE)) {
                uncompletedTasks.add(task) ;
		    }
	    }
		return uncompletedTasks ;
	}

}
