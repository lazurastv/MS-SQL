package pw.pcshop.dataModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "processors")
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "processor")
    private List<Computer> computers;

    @Column
    private String manufacturer;

    @Column(unique = true)
    private String series;

    @Column
    private int threadCount;

    @Column
    private double frequency;
}