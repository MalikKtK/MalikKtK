package repositories;

import com.example.demo.models.Department;
import com.example.demo.repositories.IRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepartmentTestRepository implements IRepository<Department> {
    ArrayList<Department> allDepartments = new ArrayList<Department>(
            Arrays.asList(
                    new Department(10, "SALES","CHICAGO"),
                    new Department(20, "MARKETING","CHICAGO"),
                    new Department(30, "HR","CHICAGO"),
                    new Department(40, "CUSTOMERSERVICE","CHICAGO")
            )
    );

    @Override
    public List<Department> getAllEntities() {
        return allDepartments;
    }

    @Override
    public Department getSingleById(int id) {
        return null;
    }

    @Override
    public boolean create(Department entity) {
        return false;
    }
}
