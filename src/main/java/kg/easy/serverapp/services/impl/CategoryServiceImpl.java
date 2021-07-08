package kg.easy.serverapp.services.impl;

import kg.easy.serverapp.dao.CategoryRepo;
import kg.easy.serverapp.mappers.CategoryMapper;
import kg.easy.serverapp.models.Category;
import kg.easy.serverapp.models.dto.CategoryDto;
import kg.easy.serverapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category category = categoryMapper.toEntity(categoryDto);
        category = categoryRepo.save(category);
        return categoryMapper.toDto(category);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto findById(Long id) {
        return null;
    }

    @Override
    public List<CategoryDto> findAll() {
        return null;
    }
}
