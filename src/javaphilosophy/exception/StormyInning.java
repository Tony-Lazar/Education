package javaphilosophy.exception;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event( ) throws RainedOut, BaseballException;

    public void rainHard( ) throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException { }

    @Override
    public void atBat( ) throws Strike, Foul {

    }



    public StormyInning(String s) throws Foul, BaseballException { }

    @Override
    public void event( ) throws BaseballException {
        super.event();
    }

    @Override
    public void rainHard( ) throws RainedOut {

    }
}
