
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.User;
public interface UserRepository extends JpaRepository<User, Integer> { 
}
