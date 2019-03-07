Pod::Spec.new do |spec|
  spec.name                     = 'DodoCardUtils'
  spec.version                  = '0.0.1'
  spec.homepage                 = 'dodopizza.com'
  spec.source                   = { :git => "Not Published", :tag => "Cocoapods/#{spec.name}/#{spec.version}" }
  spec.ios.deployment_target    = '10.0'
  spec.authors                  = 'Dodo developers'
  spec.license                  = '...'
  spec.summary                  = '...'
  spec.ios.vendored_frameworks  = "build/#{spec.name}.framework"

  spec.prepare_command = <<-SCRIPT
    set -ev
    /Users/kamilkhamidullin/Projects/dodo-kotlin-native/gradlew  -Pframework=#{spec.name}.framework initializeFramework --stacktrace
  SCRIPT

  spec.script_phases = [
    {
      :name => 'Build DodoCardUtils',
      :shell_path => '/bin/sh',
      :script => <<-SCRIPT
        set -ev
        /Users/kamilkhamidullin/Projects/dodo-kotlin-native/gradlew  -p "$PODS_TARGET_SRCROOT" "createIos${CONFIGURATION}Artifacts"
      SCRIPT
    }
  ]
end