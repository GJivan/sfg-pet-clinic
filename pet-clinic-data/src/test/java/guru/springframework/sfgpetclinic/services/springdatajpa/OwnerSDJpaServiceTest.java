package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.respository.OwnerRepository;
import guru.springframework.sfgpetclinic.respository.PetRepository;
import guru.springframework.sfgpetclinic.respository.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    @Mock
     OwnerRepository ownerRepository;
    @Mock
     PetRepository petRepository;
    @Mock
     PetTypeRepository petTypeRepository;

    @InjectMocks
     OwnerSDJpaService service;

    Owner returnOwner;

    @BeforeEach
    void setUp() {

        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {


        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = service.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME,smith.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {


    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}