package p120m;

import O.A;
import O.AbstractC0842b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p060g.j;
import p130n.c;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f46288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f46289f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f46290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f46291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f46292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f46293d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f46294c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f46295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f46296b;

        public a(Object obj, String str) {
            this.f46295a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f46296b = cls.getMethod(str, f46294c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f46296b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f46296b.invoke(this.f46295a, menuItem)).booleanValue();
                }
                this.f46296b.invoke(this.f46295a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        AbstractC0842b f46297A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private CharSequence f46298B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private CharSequence f46299C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private ColorStateList f46300D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f46301E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f46303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f46306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f46310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f46311i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f46312j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f46313k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f46314l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f46315m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f46316n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f46317o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f46318p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f46319q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f46320r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f46321s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f46322t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f46323u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f46324v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f46325w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f46326x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f46327y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f46328z;

        public b(Menu menu) {
            this.f46303a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f46292c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z9 = false;
            menuItem.setChecked(this.f46321s).setVisible(this.f46322t).setEnabled(this.f46323u).setCheckable(this.f46320r >= 1).setTitleCondensed(this.f46314l).setIcon(this.f46315m);
            int i10 = this.f46324v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f46328z != null) {
                if (g.this.f46292c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f46328z));
            }
            if (this.f46320r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f46326x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f46288e, g.this.f46290a));
                z9 = true;
            }
            int i11 = this.f46325w;
            if (i11 > 0) {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC0842b abstractC0842b = this.f46297A;
            if (abstractC0842b != null) {
                A.a(menuItem, abstractC0842b);
            }
            A.c(menuItem, this.f46298B);
            A.g(menuItem, this.f46299C);
            A.b(menuItem, this.f46316n, this.f46317o);
            A.f(menuItem, this.f46318p, this.f46319q);
            PorterDuff.Mode mode = this.f46301E;
            if (mode != null) {
                A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f46300D;
            if (colorStateList != null) {
                A.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f46310h = true;
            i(this.f46303a.add(this.f46304b, this.f46311i, this.f46312j, this.f46313k));
        }

        public SubMenu b() {
            this.f46310h = true;
            SubMenu subMenuAddSubMenu = this.f46303a.addSubMenu(this.f46304b, this.f46311i, this.f46312j, this.f46313k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f46310h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f46292c.obtainStyledAttributes(attributeSet, j.f44222o1);
            this.f46304b = typedArrayObtainStyledAttributes.getResourceId(j.f44232q1, 0);
            this.f46305c = typedArrayObtainStyledAttributes.getInt(j.f44242s1, 0);
            this.f46306d = typedArrayObtainStyledAttributes.getInt(j.f44247t1, 0);
            this.f46307e = typedArrayObtainStyledAttributes.getInt(j.f44252u1, 0);
            this.f46308f = typedArrayObtainStyledAttributes.getBoolean(j.f44237r1, true);
            this.f46309g = typedArrayObtainStyledAttributes.getBoolean(j.f44227p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            h0 h0VarU = h0.u(g.this.f46292c, attributeSet, j.f44257v1);
            this.f46311i = h0VarU.n(j.f44272y1, 0);
            this.f46312j = (h0VarU.k(j.f44035B1, this.f46305c) & (-65536)) | (h0VarU.k(j.f44040C1, this.f46306d) & 65535);
            this.f46313k = h0VarU.p(j.f44045D1);
            this.f46314l = h0VarU.p(j.f44050E1);
            this.f46315m = h0VarU.n(j.f44262w1, 0);
            this.f46316n = c(h0VarU.o(j.f44055F1));
            this.f46317o = h0VarU.k(j.f44090M1, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            this.f46318p = c(h0VarU.o(j.f44060G1));
            this.f46319q = h0VarU.k(j.f44110Q1, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (h0VarU.s(j.f44065H1)) {
                this.f46320r = h0VarU.a(j.f44065H1, false) ? 1 : 0;
            } else {
                this.f46320r = this.f46307e;
            }
            this.f46321s = h0VarU.a(j.f44277z1, false);
            this.f46322t = h0VarU.a(j.f44030A1, this.f46308f);
            this.f46323u = h0VarU.a(j.f44267x1, this.f46309g);
            this.f46324v = h0VarU.k(j.f44115R1, -1);
            this.f46328z = h0VarU.o(j.f44070I1);
            this.f46325w = h0VarU.n(j.f44075J1, 0);
            this.f46326x = h0VarU.o(j.f44085L1);
            String strO = h0VarU.o(j.f44080K1);
            this.f46327y = strO;
            boolean z9 = strO != null;
            if (z9 && this.f46325w == 0 && this.f46326x == null) {
                this.f46297A = (AbstractC0842b) e(strO, g.f46289f, g.this.f46291b);
            } else {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f46297A = null;
            }
            this.f46298B = h0VarU.p(j.f44095N1);
            this.f46299C = h0VarU.p(j.f44120S1);
            if (h0VarU.s(j.f44105P1)) {
                this.f46301E = O.e(h0VarU.k(j.f44105P1, -1), this.f46301E);
            } else {
                this.f46301E = null;
            }
            if (h0VarU.s(j.f44100O1)) {
                this.f46300D = h0VarU.c(j.f44100O1);
            } else {
                this.f46300D = null;
            }
            h0VarU.x();
            this.f46310h = false;
        }

        public void h() {
            this.f46304b = 0;
            this.f46305c = 0;
            this.f46306d = 0;
            this.f46307e = 0;
            this.f46308f = true;
            this.f46309g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f46288e = clsArr;
        f46289f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f46292c = context;
        Object[] objArr = {context};
        this.f46290a = objArr;
        this.f46291b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        z10 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC0842b abstractC0842b = bVar.f46297A;
                            if (abstractC0842b == null || !abstractC0842b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z9 = true;
                    }
                }
            } else if (!z10) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z10 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f46293d == null) {
            this.f46293d = a(this.f46292c);
        }
        return this.f46293d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof H.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z9 = false;
        try {
            try {
                layout = this.f46292c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof e) {
                    e eVar = (e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z9 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z9) {
                    ((e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z9) {
                ((e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
