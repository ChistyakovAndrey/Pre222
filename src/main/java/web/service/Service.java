package web.service;

import org.springframework.ui.Model;

public interface Service {
    Model getCarsFromParams(Model model, Integer count);
}
