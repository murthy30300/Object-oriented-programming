package week6;
interface State {
    void pressButton(TVRemote tvRemote);
}

class OnState implements State {
    @Override
    public void pressButton(TVRemote tvRemote) {
        System.out.println("TV is turned off");
        tvRemote.setState(new OffState());
    }
}

class OffState implements State {
    @Override
    public void pressButton(TVRemote tvRemote) {
        System.out.println("TV is turned on");
        tvRemote.setState(new OnState());
    }
}

class TVRemote {
    State currentState;

    public TVRemote() {
        currentState = new OnState();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void pressButton() {
        currentState.pressButton(this);
    }
}

public class postLab {
    public static void main(String[] args) {
        TVRemote tvRemote = new TVRemote();

        tvRemote.pressButton();
        System.out.println("Current state: " + tvRemote.currentState.getClass().getSimpleName());

        tvRemote.pressButton();
        System.out.println("Current state: " + tvRemote.currentState.getClass().getSimpleName());
    }
}
