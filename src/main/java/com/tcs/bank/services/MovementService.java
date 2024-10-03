package com.tcs.bank.services;

import com.tcs.bank.models.Movement;
import com.tcs.bank.models.MovementDto;

import java.util.List;

public interface MovementService {

    Movement createMovement(Long accountNumber, Movement movement);

    Movement searchBalance(Long accountNumber);

    List<MovementDto> accountState(String documentId, String fromDate);
}
