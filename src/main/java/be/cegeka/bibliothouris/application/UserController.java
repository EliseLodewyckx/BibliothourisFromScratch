package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.users.User;
import be.cegeka.bibliothouris.domain.users.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/user")
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Iterable<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    void addUser(@RequestParam(value = "name", required = true) String name) {
        userService.addUser(name);
    }

    @ResponseBody
    @RequestMapping (path = "/book", method = RequestMethod.POST)
    public void addUserWithBook(@RequestParam(value = "name") String name,
                               @RequestParam(value = "title") String title,
                                @RequestParam(value = "ISBN") String ISBN,
                                @RequestParam(value = "AuthorFirstName") String authorFirstName,
                                @RequestParam(value = "AuthorLastName") String authorLastName
    )
    {userService.addUserWithBook(name, title,ISBN, authorFirstName, authorLastName);}

    @ResponseBody
    @RequestMapping(path = "/address", method = RequestMethod.POST)
    public void addUserWithAddress(@RequestParam(value = "name") String name,
                                   @RequestParam(value = "city") String city,
                                   @RequestParam(value = "streetname") String streetname,
                                   @RequestParam(value = "number") String  addressNumber){
        userService.addUserWithAddress(name, city, streetname, addressNumber);
    }
}
