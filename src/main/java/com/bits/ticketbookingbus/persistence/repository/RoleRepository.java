
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.Role;
public interface RoleRepository extends JpaRepository<Role, Integer> { 
}
