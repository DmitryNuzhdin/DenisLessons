package checklist;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IoServiceSupervisor {
    List<IoService> ioServiceList;

    public IoServiceSupervisor(List<IoService> ioServiceList) {
        this.ioServiceList = ioServiceList;
    }

    public void startAll(){
        ioServiceList.forEach(IoService::start);
    }
}
