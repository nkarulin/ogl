package KNS.shaders;

import KNS.shaders.ShaderProgram;

/**
 * Created by kodoo on 15.02.2016.
 */
public class StaticShader extends ShaderProgram {

    private static final String VERTEX_FILE = "shader.vert";
    private static final String FRAGMENT_FILE = "shader.frag";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void getAllUniformLocations() {

    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
        super.bindAttribute(1, "textureCoords");
    }
}