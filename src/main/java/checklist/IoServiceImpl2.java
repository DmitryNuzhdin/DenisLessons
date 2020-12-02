package checklist;

import checklist.model.Model;
import org.springframework.stereotype.Component;

public class IoServiceImpl2 implements IoService {
    private final Model model;

    public IoServiceImpl2(Model model) {
        this.model = model;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
