package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f13188b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f13190a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f13190a == null) {
                this.f13190a = Header.b(com.apm.insight.e.g());
            }
            return this.f13190a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f13189a;

    e() {
        this(f13188b);
    }

    public Object a(String str) {
        e eVar = this.f13189a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f13189a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f13189a = eVar;
    }
}
