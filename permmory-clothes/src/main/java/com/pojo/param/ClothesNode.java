package com.pojo.param;

/**
 * 衣物节点
 */
public class ClothesNode {
    // 上衣-0（01-T恤，），下衣-1（），鞋子-2（），配饰-3（）
    private String type;

    private String coler;

    private String name;
    // 使用次数（天）
    private Short usedTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Short usedTime) {
        this.usedTime = usedTime;
    }
}
