package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default List c(Field field) {
        return Collections.EMPTY_LIST;
    }

    String d(Field field);
}
