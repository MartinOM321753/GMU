package utez.edu.mx.gmuback.modules.user;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import utez.edu.mx.gmuback.utils.APIResponse;

@Service

public class UserService {
private final UserRepository userRepository;
public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

}

    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<APIResponse> findall(){
    APIResponse body = new APIResponse("Operacion Exitosa",userRepository.findAll(), HttpStatus.OK);

    return new ResponseEntity<>(body,HttpStatus.OK);
}
}
