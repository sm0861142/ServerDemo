package service;

import dao.NewTypeDao;
import entity.NewType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewTypeServiceImpl implements INewTypeService {
    @Autowired
    private NewTypeDao newTypeDao;
    @Override
    public List<NewType> getAllType() {
        return newTypeDao.getAllType();
    }
}
