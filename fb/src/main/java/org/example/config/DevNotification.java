package org.example.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev & !milan")
public class DevNotification {


}

@Component
@Profile("prod")
class ProdNotification{

}