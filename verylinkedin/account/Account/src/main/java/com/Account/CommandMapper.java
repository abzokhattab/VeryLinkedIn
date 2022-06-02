package com.Account.Account;

import com.Account.ICommand;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommandMapper {

    private final Map<String, ICommand> map;

    public CommandMapper(Map<String, ICommand> map) {
        this.map = map;
    }
}
