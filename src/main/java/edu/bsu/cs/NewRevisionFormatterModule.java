package edu.bsu.cs;

import edu.bsu.cs.view.NewRevisionFormatter;
import edu.bsu.cs.model.NewRevisionFormatterInterface;
import com.google.inject.AbstractModule;


public class NewRevisionFormatterModule extends AbstractModule{
    @Override
    protected void configure(){
        bind(NewRevisionFormatterInterface.class).to(NewRevisionFormatter.class);
    }

}
