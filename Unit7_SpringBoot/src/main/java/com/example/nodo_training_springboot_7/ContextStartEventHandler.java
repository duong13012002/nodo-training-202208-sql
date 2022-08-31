package com.example.nodo_training_springboot_7;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    private final static Logger LOGGER = Logger.getLogger(ContextStartEventHandler.class);
    @Autowired
    private DataSource dataSource;

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {

//        LOGGER.info("context start application"+dataSource);
    }
    private void createTable(String name, String script)throws Exception{
        DatabaseMetaData dbmd = dataSource.getConnection().getMetaData();
        ResultSet rs = dbmd.getTables(null,null,name,null);
        if (rs.next()) {
            LOGGER.info("Table" + rs.getString("TABLE_NAME")+"already exists!");
            return;
        }
        dataSource.getConnection().createStatement().executeUpdate(script);
    }

}
