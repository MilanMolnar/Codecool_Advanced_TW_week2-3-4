public class PrevActivity implements Activity {
    ConsoleWriter cw = new ConsoleWriter();
    LogWriter log = new LogWriter();
    public PrevActivity(ConsoleWriter Cw) {
        cw = Cw;
    }

    @Override
    public void activity(Boolean bool) {

        cw.write("The prev song is coming");
        if(bool){
            log.write("The prev song is coming");
        }
    }
}
