
package com.bits.ticketbookingbus.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bits.ticketbookingbus.persistence.entity.UserRole;
import java.util.List;
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> { 
List<UserRole> findByUserIdIn(List<Integer> idList);
List<UserRole> findByRoleIdIn(List<Integer> idList);
}
