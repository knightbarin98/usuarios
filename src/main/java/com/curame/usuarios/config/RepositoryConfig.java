package com.curame.usuarios.config;

import com.curame.usuarios.models.entity.Profile;
import com.curame.usuarios.models.entity.Role;
import com.curame.usuarios.models.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(User.class, Role.class, Profile.class);
    }
}
