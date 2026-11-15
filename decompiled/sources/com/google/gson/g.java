package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import p108k7.G;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public f a() {
        if (e()) {
            return (f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public j b() {
        if (i()) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public l d() {
        if (j()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean e() {
        return this instanceof f;
    }

    public boolean g() {
        return this instanceof i;
    }

    public boolean i() {
        return this instanceof j;
    }

    public boolean j() {
        return this instanceof l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            p138n7.c cVar = new p138n7.c(stringWriter);
            cVar.V0(p.LENIENT);
            G.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
