package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    private PersonRepository repository;

    public MainView(PersonRepository repository) {
        this.repository = repository;

//        var button = new Button("Click me");
//        var textField = new TextField();
//        add(new HorizontalLayout(textField, button));
//
//        button.addClickListener(e -> {
//           add(new Paragraph("Hello, " + textField.getValue()));
//           textField.clear();
//        });
    }
}
