package O2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f4462c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f4463a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f4464b;

    @Override // O2.d
    public o M0() {
        return n.f4492d;
    }

    @Override // p243y2.a
    public void N(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f4462c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f4463a.put(str, obj);
            }
        }
    }

    @Override // O2.d
    public l O0() {
        if (this.f4464b == null) {
            this.f4464b = new m(getWidth(), getHeight(), f0(), M0(), getExtras());
        }
        return this.f4464b;
    }

    @Override // O2.k, p243y2.a
    public Map getExtras() {
        return this.f4463a;
    }

    @Override // O2.d
    public boolean i1() {
        return false;
    }

    @Override // p243y2.a
    public void v(String str, Object obj) {
        if (f4462c.contains(str)) {
            this.f4463a.put(str, obj);
        }
    }
}
