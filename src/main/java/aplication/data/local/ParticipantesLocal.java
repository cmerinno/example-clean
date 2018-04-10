package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParticipantesLocal implements Local {

    @Override
    public List<ParticitanteEntity> obtenerPartcipantes() {
        List participantes = new ArrayList();
        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.add(particitanteEntityUno);
        participantes.add(particitanteEntityDos);
        participantes.add(particitanteEntityTres);
        participantes.add(particitanteEntityCuatro);


        return participantes;
    }

    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {
        Map <String, ParticitanteEntity> participantes = new HashMap<>();

        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");
        particitanteEntityUno.setRut("111111");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");
        particitanteEntityDos.setRut("22222");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");
        particitanteEntityTres.setRut("3333333");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");
        particitanteEntityCuatro.setRut("44444");

        participantes.put(particitanteEntityUno.getRut(), particitanteEntityDos);
        participantes.put(particitanteEntityDos.getRut(), particitanteEntityDos);
        participantes.put(particitanteEntityTres.getRut(), particitanteEntityTres);
        participantes.put(particitanteEntityCuatro.getRut(), particitanteEntityCuatro);


        ParticitanteEntity participante = participantes.get(rut);

        return participante;
    }
}
