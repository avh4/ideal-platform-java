package net.avh4.ideal.platform;

@SuppressWarnings("UnusedDeclaration")
public interface DevelopmentPlatform<PROJECT, EXECUTION_ENVIRONMENT, INSTALLABLE_PACKAGE, INSTALLATION_TARGET> {

    public EXECUTION_ENVIRONMENT compile(PROJECT project);

    public INSTALLABLE_PACKAGE package_(PROJECT project);

    public TestResults test(PROJECT project);

    public void execute(EXECUTION_ENVIRONMENT environment, InputStream input, OutputStream output);

    public EXECUTION_ENVIRONMENT install(INSTALLABLE_PACKAGE package_);

    public EXECUTION_ENVIRONMENT deploy(INSTALLABLE_PACKAGE package_, INSTALLATION_TARGET target);
}
