package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsList (){
       return "<html>" +
                "<h1>Skills Tracker</h1>" +
               "<h2>" +
               "<ol>" +
               "<li>JavaScript</li>" +
               "<li>Java</li>" +
               "<li>TypeScript</li>" +
               "</ol>" +
               "</h2>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form method ='post' action ='/form'>" + //submit request to /form
                "<input type = 'text' name='name'><br>" +
                "<label>Choose your favorite language:</label><br>" +
                "<select name = 'languageOne' id ='language-select'" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='TypeScript'>TypeScript</option>" +
                "</select><br>" +
                "<label>Choose your second favorite language:</label><br>" +
                "<select name = 'languageTwo' id ='language-select'" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='TypeScript'>TypeScript</option>" +
                "</select><br>" +
                "<label>Choose your third favorite language:</label><br>" +
                "<select name = 'languageThree' id ='language-select'" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='TypeScript'>TypeScript</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Make me a list!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String skillsListFinal (@RequestParam String name, String languageOne, String languageTwo, String languageThree){
        return "<html>" +
                "<h1>" +
                name +
                "<ol>" +
                "<li>" +
                languageOne +
                "</li>" +
                "<li>" +
                languageTwo +
                "</li>" +
                "<li>" +
                languageThree +
                "</li>" +
                "</ol>" +
                "</html>";
    }

}
