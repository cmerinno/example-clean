package aplication.endpoint;

import aplication.domain.usecase.ObtenerParticipanteUseCases;
import aplication.endpoint.mapper.ParticipanteViewModelToModel;
import aplication.endpoint.modelview.ParticipanteViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
//@RequestMapping(value = "/participantes", params = {"_rut"})
public class ParticipanteEndpoint {

    @Autowired
    private ObtenerParticipanteUseCases obtenerParticipanteUseCases;

    @RequestMapping(value = "/participante", method = RequestMethod.GET)
    public ParticipanteViewModel obtenerParticipante(@RequestParam(value = "_rut") String rut){
        return ParticipanteViewModelToModel.reverse(obtenerParticipanteUseCases.obtenerParticipante(rut));
    }

}
