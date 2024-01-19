package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    private PersonRepository repository;
    private TextField firstName = new TextField("First Name");
    private TextField lastName = new TextField("Last Name");
    private EmailField email = new EmailField("Email");
    private Binder<Person> binder = new Binder<>(Person.class);
    private Grid<Person> grid = new Grid<>(Person.class);

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
