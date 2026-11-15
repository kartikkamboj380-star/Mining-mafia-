package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f40731a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f40731a = field;
    }

    public String toString() {
        return this.f40731a.toString();
    }
}
