package com.diyorbek.dictionarybackend.resources;

import com.diyorbek.dictionarybackend.beans.StudentsBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TranslationsResource {

//    @GetMapping("translations")
//    public String getTranslations() {
//        return "Olma-apple";
//    }

    @RequestMapping(value = "translations", method = RequestMethod.GET)
    public ResponseEntity getTranslationsAll() {
        StudentsBean studentsBean = new StudentsBean(1L, "Diyorbek", "Toraboyev", 1);
        StudentsBean studentsBean1 = new StudentsBean(2L, "Mansur", "Toraboyev", 21);
        StudentsBean studentsBean2 = new StudentsBean(3L, "Alisher", "Toraboyev", 31);

        List<StudentsBean> list = new ArrayList<>();

        list.add(studentsBean);
        list.add(studentsBean1);
        list.add(studentsBean2);

        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "translations/{id}", method = RequestMethod.GET)
    public ResponseEntity getTranslationsOne(@PathVariable Long id) {
        StudentsBean studentsBean = new StudentsBean(id, "Diyorbek", "Toraboyev", 1);

        return ResponseEntity.ok(studentsBean);
    }


    @RequestMapping(value = "translations", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody StudentsBean studentsBean) {
        return ResponseEntity.ok(studentsBean);
    }

    @RequestMapping(value = "translations/{id}", method = RequestMethod.POST)
    public ResponseEntity update(@PathVariable Long id, @RequestBody StudentsBean bean) {
        StudentsBean studentsBean = new StudentsBean(1L, "Diyorbek", "Toraboyev", 1);
        studentsBean.setId(bean.getId());
        studentsBean.setName(bean.getName());
        studentsBean.setLast_name(bean.getLast_name());

        return ResponseEntity.ok(studentsBean);
    }
}
