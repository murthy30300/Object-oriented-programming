package endSem;
interface LeaveRequestProcessor {
    void processRequest(LeaveRequest request);
	void setNextApprover(LeaveRequestProcessor ceoApprover);
}

abstract class LeaveRequestApprover implements LeaveRequestProcessor
{
    private LeaveRequestProcessor nextApprover;
    public void setNextApprover(LeaveRequestProcessor nextApprover) 
    {
        this.nextApprover = nextApprover;
    }
    public void processRequest(LeaveRequest request)
    {
        if (canApproveRequest(request)) 
        {
            approveRequest(request);
        } else if (nextApprover != null) 
        {
            nextApprover.processRequest(request);
        } else 
        {
            System.out.println("No approver found for request: " + request);
        }
    }

    abstract boolean canApproveRequest(LeaveRequest request);
    abstract void approveRequest(LeaveRequest request);
}

class ManagerApprover extends LeaveRequestApprover {
    @Override
    boolean canApproveRequest(LeaveRequest request) {
        return request.getDays() <= 2;
    }

    @Override
    void approveRequest(LeaveRequest request) {
        System.out.println("Manager approved leave request for " + request.getEmployeeName() + " for " + request.getDays() + " days.");
    }
}

class DirectorApprover extends LeaveRequestApprover {
    @Override
    boolean canApproveRequest(LeaveRequest request) {
        return request.getDays() <= 5;
    }

    @Override
    void approveRequest(LeaveRequest request) {
        System.out.println("Director approved leave request for " + request.getEmployeeName() + " for " + request.getDays() + " days.");
    }
}

class CEOApprover extends LeaveRequestApprover {
    @Override
    boolean canApproveRequest(LeaveRequest request) {
        return true;
    }

    @Override
    void approveRequest(LeaveRequest request) {
        System.out.println("CEO approved leave request for " + request.getEmployeeName() + " for " + request.getDays() + " days.");
    }
}

public class chainDemo {
    public static void main(String[] args) {
        LeaveRequestProcessor managerApprover = new ManagerApprover();
        LeaveRequestProcessor directorApprover = new DirectorApprover();
        LeaveRequestProcessor ceoApprover = new CEOApprover();

        managerApprover.setNextApprover(directorApprover);
        directorApprover.setNextApprover(ceoApprover);
        
        LeaveRequest request1 = new LeaveRequest("John Doe", 2);
        LeaveRequest request2 = new LeaveRequest("Jane Doe", 4);
        LeaveRequest request3 = new LeaveRequest("Peter Jones", 10);

        managerApprover.processRequest(request1);
        managerApprover.processRequest(request2);
        managerApprover.processRequest(request3);
    }
}

class LeaveRequest {
    private String employeeName;
    private int days;

    public LeaveRequest(String employeeName, int days) {
        this.employeeName = employeeName;
        this.days = days;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDays() {
        return days;
    }
}

