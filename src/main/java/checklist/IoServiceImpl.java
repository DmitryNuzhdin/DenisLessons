package checklist;

import checklist.model.Model;
import org.springframework.stereotype.Component;

@Component
public class IoServiceImpl implements IoService {
    private final Model model;

    public IoServiceImpl(Model model) {
        this.model = model;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
