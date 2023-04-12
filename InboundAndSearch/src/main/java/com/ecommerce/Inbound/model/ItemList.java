package com.ecommerce.Inbound.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ItemList {

    private List<ItemElastic> itemElastics;
}
