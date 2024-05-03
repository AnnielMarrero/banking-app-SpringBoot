package net.javaguides.bankingapp.mapper;

import net.javaguides.bankingapp.dto.AccountDto;
import net.javaguides.bankingapp.entity.Account;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Account mapToAccount(AccountDto accountDto){
        return modelMapper.map(accountDto, Account.class);
    }

    public AccountDto mapToAccountDto(Account account){
        return modelMapper.map(account, AccountDto.class);
    }
}
