package web.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.crud.model.Role;

import java.util.HashSet;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByName (String name);

    List<Role> getAllRoles();

    HashSet<Role> getSetOfRoles(String[] roleNames);
}
