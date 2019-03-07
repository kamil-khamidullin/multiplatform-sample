Pod::Spec.new do |spec|
  spec.name                     = 'DodoPayment'
  spec.version                  = '0.0.1'
  spec.homepage                 = 'dodopizza.com'
  spec.source                   = { :git => "git@github.com:kamil-khamidullin/multiplatform-sample.git", :tag => "#{spec.version}" }
  spec.resources                = "*"
  spec.ios.deployment_target    = '10.0'
  spec.authors                  = 'Dodo developers'
  spec.license                  = '...'
  spec.summary                  = '...'
  spec.ios.vendored_frameworks  = "build/#{spec.name}.framework"

  spec.prepare_command = <<-SCRIPT
    set -ev
    gradle -Pframework=#{spec.name}.framework initializeFramework --stacktrace
  SCRIPT

  spec.script_phases = [
    {
      :name => 'Build DodoPayment',
      :shell_path => '/bin/sh',
      :script => <<-SCRIPT
        set -ev
        gradle -p "$PODS_TARGET_SRCROOT" "createIos${CONFIGURATION}Artifacts"
      SCRIPT
    }
  ]
end